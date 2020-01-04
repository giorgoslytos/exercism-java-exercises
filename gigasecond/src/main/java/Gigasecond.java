import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {
	LocalDateTime output;
	
    Gigasecond(LocalDate moment) {
    	output = LocalDateTime.of(moment, LocalTime.MIN).plusSeconds((int) Math.pow(10, 9));
    }

    Gigasecond(LocalDateTime moment) {
    	output = moment.plusSeconds((int) Math.pow(10, 9));
    }

    LocalDateTime getDateTime() {
    	return output;
    }
}
