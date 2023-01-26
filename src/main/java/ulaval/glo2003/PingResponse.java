package ulaval.glo2003;

public class PingResponse {
    public final String name;
    public final String header;
    public final String pathParam;

    public PingResponse(String name, String header, String pathParam) {
        this.name = name;
        this.header = header;
        this.pathParam = pathParam;
    }
}
