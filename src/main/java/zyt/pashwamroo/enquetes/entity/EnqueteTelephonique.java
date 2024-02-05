package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table
public class EnqueteTelephonique extends Enquete{

    @Column(name = "script_D_Accroche",nullable = false)
    @Lob
    private String scriptDAccroche;

    public String getScriptDAccroche() {
        return scriptDAccroche;
    }

    public void setScriptDAccroche(String scriptDAccroche) {
        this.scriptDAccroche = scriptDAccroche;
    }
}
