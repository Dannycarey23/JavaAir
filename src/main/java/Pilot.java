public class Pilot {
    private String name;
    private String licenceNumber;
    private PilotRank pilotRank;

    public Pilot(String name, PilotRank pilotRank, String licenceNumber){
        this.name = name;
        this.pilotRank = pilotRank;
        this.licenceNumber = licenceNumber;

    }

    public String getName() {
        return this.name;
    }

    public PilotRank getRank() {
        return this.pilotRank;
    }

    public String getLicenceNo() {
        return this.licenceNumber;
    }
}
