
import lombok.Data;
import lombok.extern.log4j.Log4j2;


@Data
@Log4j2

public class lombok_use {
    private int id;

    public static void main(String args[]) {

        lombok_use a = new lombok_use();
        a.setId(10);
        System.out.println(a.getId());
        System.out.println(a.toString());

         log.info("1231321");
         log.debug("aa");


    }
}
