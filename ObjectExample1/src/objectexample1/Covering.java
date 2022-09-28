
package objectexample1;


public enum Covering {
    SCALES, SLIME, HAIR, FEATHERS, SPIKES;
    
    public String describe(){
        switch(this){
            case SCALES:
                return "small hard overlapping surfaces";
            case SLIME:
                return "a slick gooey mess";
            case HAIR:
                return "thin strands covering thickly";
            case FEATHERS:
                return "small bundles of strands linked on a stem";
            case SPIKES:
                return "many pokey things...";
            default:
                return "an outer covering for the skin";
        }
    }
}
