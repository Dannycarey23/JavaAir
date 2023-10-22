//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CabinCrewMember {
    private String name;
    private CabinCrewRank rank;

    public CabinCrewMember(String name, CabinCrewRank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public CabinCrewRank getRank() {
        return this.rank;
    }

    public String welcomeMessage() {
        return "Welcome to JavaAir!";
    }
}
