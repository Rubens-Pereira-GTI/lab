package observerLab;

import java.util.Date;

public class ChegadaFuncionarioEvent {
    Date date;
    ChegadaFuncionarioEvent(Date date){
        this.date = date;
    }

    Date getDate() {
        return date;
    }
}
