import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDatetimeUse {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now(); // 当前日期
        LocalTime t = LocalTime.now(); // 当前时间
        LocalDateTime dt = LocalDateTime.now(); // 当前日期和时间
        System.out.println(d); // 严格按照ISO 8601格式打印
        System.out.println(t); // 严格按照ISO 8601格式打印
        System.out.println(dt); // 严格按照ISO 8601格式打印

        // 解析字符为时间
        LocalDateTime dt_ = LocalDateTime.parse("2019-11-19T15:16:17");
        LocalDate d_ = LocalDate.parse("2019-11-19");
        LocalTime t_ = LocalTime.parse("15:16:17");
        System.out.println(dt_);
        System.out.println(d_);
        System.out.println(t_);

        // 自定义格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        // 日期加减

        LocalDateTime dt2 = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        System.out.println(dt2);
        // 加5天减3小时:
        LocalDateTime dt3 = dt2.plusDays(5).minusHours(3);
        System.out.println(dt3); // 2019-10-31T17:30:59
        // 减1月:
        LocalDateTime dt4 = dt2.minusMonths(1);
        System.out.println(dt4); // 2019-09-30T17:30:59

        // 直接调整日期

        // LocalDateTime dt = LocalDateTime.of(2019, 10, 26, 20, 30, 59);
        // System.out.println(dt);
        // // 日期变为31日:
        // LocalDateTime dt2 = dt.withDayOfMonth(31);
        // System.out.println(dt2); // 2019-10-31T20:30:59
        // // 月份变为9:
        // LocalDateTime dt3 = dt2.withMonth(9);
        // System.out.println(dt3); // 2019-09-30T20:30:59


        // with 高级用法

        // LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        // System.out.println(firstDay);
        //
        // // 本月最后1天:
        // LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        // System.out.println(lastDay);
        //
        // // 下月第1天:
        // LocalDate nextMonthFirstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        // System.out.println(nextMonthFirstDay);
        //
        // // 本月第1个周一:
        // LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        // System.out.println(firstWeekday);


        // 时间先后比较

        // LocalDateTime now = LocalDateTime.now();
        // LocalDateTime target = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        // System.out.println(now.isBefore(target));
        // System.out.println(LocalDate.now().isBefore(LocalDate.of(2019, 11, 19)));
        // System.out.println(LocalTime.now().isAfter(LocalTime.parse("08:15:00")));

        // 时间间隔

        // LocalDateTime start = LocalDateTime.of(2019, 11, 19, 8, 15, 0);
        // LocalDateTime end = LocalDateTime.of(2020, 1, 9, 19, 25, 30);
        // Duration d = Duration.between(start, end);
        // System.out.println(d); // PT1235H10M30S
        //
        // Period p = LocalDate.of(2019, 11, 19).until(LocalDate.of(2020, 1, 9));
        // System.out.println(p); // P1M21D
    }
}
