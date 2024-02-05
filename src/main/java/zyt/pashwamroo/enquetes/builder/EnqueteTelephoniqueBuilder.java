package zyt.pashwamroo.enquetes.builder;

import zyt.pashwamroo.enquetes.dto.EnqueteTelephoniqueDto;

public class EnqueteTelephoniqueBuilder extends EnqueteBuilder {

    private String scriptDAccroche;

    public EnqueteTelephoniqueBuilder fromEnqueteTelephoniqueDto(EnqueteTelephoniqueDto enqueteTelephoniqueDto) {
        scriptDAccroche = enqueteTelephoniqueDto.getScriptDAccroche();
        return this;
    }

    public String getScriptDAccroche() {
        return scriptDAccroche;
    }

    public void setScriptDAccroche(String scriptDAccroche) {
        this.scriptDAccroche = scriptDAccroche;
    }
}
