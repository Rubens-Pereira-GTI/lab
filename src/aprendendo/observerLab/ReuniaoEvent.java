package aprendendo.observerLab;

import java.util.Date;

public class ReuniaoEvent {
    Date date;

    public ReuniaoEvent(Date date){
        this.date = date;
    }

    public Date horarioDaChegada(){
        return date;
    }
}
