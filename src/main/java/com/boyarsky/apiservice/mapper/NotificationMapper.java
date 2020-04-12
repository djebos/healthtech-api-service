package com.boyarsky.apiservice.mapper;

import com.boyarsky.apiservice.dto.notification.CreateNotificationDto;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.time.ZonedDateTime;

import static java.time.temporal.ChronoField.OFFSET_SECONDS;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NotificationMapper {
    NotificationMapper NOTIFICATION_MAPPER = Mappers.getMapper(NotificationMapper.class);

    @Mappings({
            @Mapping(source = "title", target = "summary"),
            @Mapping(target = "colorId"),
            @Mapping(target = "description"),
            @Mapping(target = "recurrence"),
            @Mapping(source = "startTime", target = "start")
    })
    Event toEvent(CreateNotificationDto notification);

    static EventDateTime fromZonedDateTime(ZonedDateTime dateTime) {
        EventDateTime eventDateTime = new EventDateTime();
        eventDateTime.setDate(new DateTime(dateTime.toInstant().toEpochMilli(), dateTime.getOffset().get(OFFSET_SECONDS) / 60));
        return eventDateTime;
    }
}
