import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private LocalDateTime moment;

    Gigasecond(LocalDate moment) {
        this(moment.atStartOfDay());
    }

    Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }

    LocalDateTime getDateTime() {
        long gigs = (long) Math.pow(10, 9);
        return moment.plusSeconds(gigs);
    }

}
