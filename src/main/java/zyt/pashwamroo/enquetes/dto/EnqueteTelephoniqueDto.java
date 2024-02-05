package zyt.pashwamroo.enquetes.dto;

import java.util.Calendar;
import java.util.Date;

public class EnqueteTelephoniqueDto extends EnqueteDto {

    private String scriptDAccroche;

    public EnqueteTelephoniqueDto(Calendar calendar, Long id, String nom, Date dateLancement, float prix, String scriptDAccroche) {
        super(calendar, id, nom, dateLancement, prix);
        this.scriptDAccroche = scriptDAccroche;
    }

    public String getScriptDAccroche() {
        return scriptDAccroche;
    }

    public void setScriptDAccroche(String scriptDAccroche) {
        this.scriptDAccroche = scriptDAccroche;
    }
}
