package sender.fixture.table

import com.ninja_squad.dbsetup.operation.Operation
import sender.testing.buildLoadingFixturesOperation
import java.time.OffsetDateTime
import java.util.*

data class SenderTableFixture(
    val sender_uuid: UUID = UUID.fromString("389afb90-42cd-4739-a1e1-062a1d6285c"),
    val full_name: String = "送付アカウント",
    val created_at: OffsetDateTime = OffsetDateTime.parse("2019-01-01T00:00:00Z")
) {
    fun _2人目() =
        copy(
            sender_uuid =
            UUID.fromString(
                "553707cc-72d5-4634-b660-6f541102418a"
            ),
            full_name = "送付アカウント2"
        )
}

fun buildSenderOperation(fixtureAccounts: List<SenderTableFixture>): Operation {
    return buildLoadingFixturesOperation(fixtureAccounts, "sender")
}
