package zyt.pashwamroo.enquetes.dto;

import java.util.Calendar;
import java.util.Date;

public class EnqueteInternetDto extends EnqueteDto{
    public EnqueteInternetDto(Calendar calendar, Long id, String nom, Date dateLancement, float prix) {
        super(calendar, id, nom, dateLancement, prix);
    }

}
