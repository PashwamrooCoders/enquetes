package zyt.pashwamroo.enquetes.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enqueteTelephonique")
@DiscriminatorValue(value = "TLPHONE")
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
