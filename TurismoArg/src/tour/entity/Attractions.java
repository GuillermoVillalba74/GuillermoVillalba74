package tour.entity;

public class Attractions {

    private String name;

    private Double expensive;

    private Double time;

    private Short quota;
    
    

    public Attractions() {
    }

    public Attractions(String name, Double expensive, Double time,Short quota) {
        this.name = name;
        this.expensive = expensive;
        this.time = time;
        this.quota = quota;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getExpensive() {
        return expensive;
    }

    public void setExpensive(Double expensive) {
        this.expensive = expensive;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Short getQuota() {
        return quota;
    }

    public void setQuota(Short quota) {
        this.quota = quota;
    }

    @Override
    public String toString() {
        return "Attractions{" + "name=" + name + ", expensive=" + expensive + ", time=" + time + ", quota=" + quota + '}';
    }
    
    
}
