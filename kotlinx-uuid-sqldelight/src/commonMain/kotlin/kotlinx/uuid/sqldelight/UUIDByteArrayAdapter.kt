package kotlinx.uuid.sqldelight

import com.squareup.sqldelight.*
import kotlinx.uuid.*

public object UUIDByteArrayAdapter : ColumnAdapter<UUID, ByteArray> {
    override fun decode(databaseValue: ByteArray): UUID = UUID(databaseValue)
    override fun encode(value: UUID): ByteArray = value.encodeToByteArray()
}
