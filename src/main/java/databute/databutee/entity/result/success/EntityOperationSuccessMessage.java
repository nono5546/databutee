package databute.databutee.entity.result.success;

import com.google.common.base.MoreObjects;
import databute.databutee.entity.EntityMessage;
import databute.databutee.entity.EntityValueType;
import databute.databutee.network.message.MessageCode;

import java.time.Instant;

import static com.google.common.base.Preconditions.checkNotNull;

public class EntityOperationSuccessMessage implements EntityMessage {

    private final String id;
    private final String key;
    private final EntityValueType valueType;
    private final Object value;
    private final Instant createdTimestamp;
    private final Instant lastUpdatedTimestamp;

    public EntityOperationSuccessMessage(String id,
                                         String key,
                                         EntityValueType valueType,
                                         Object value,
                                         Instant createdTimestamp,
                                         Instant lastUpdatedTimestamp) {
        this.id = checkNotNull(id, "id");
        this.key = checkNotNull(key, "key");
        this.valueType = checkNotNull(valueType, "valueType");
        this.value = checkNotNull(value, "value");
        this.createdTimestamp = checkNotNull(createdTimestamp, "createdTimestamp");
        this.lastUpdatedTimestamp = checkNotNull(lastUpdatedTimestamp, "lastUpdatedTimestamp");
    }

    @Override
    public MessageCode messageCode() {
        return MessageCode.ENTITY_OPERATION_SUCCESS;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String key() {
        return key;
    }

    public EntityValueType valueType() {
        return valueType;
    }

    public Object value() {
        return value;
    }

    public Instant createdTimestamp() {
        return createdTimestamp;
    }

    public Instant lastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("messageCode", messageCode())
                .add("id", id)
                .add("key", key)
                .add("valueType", valueType)
                .add("value", value)
                .add("createdTimestamp", createdTimestamp)
                .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
                .toString();
    }
}
