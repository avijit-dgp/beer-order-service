package avi.learn.beerorderservice.web.model;

import lombok.Data;

import javax.validation.constraints.Null;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
public class BaseDto {
    @Null
    private UUID id;

    @Null
    private Integer version;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;
}
