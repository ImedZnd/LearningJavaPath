public record RangeRecordeCanincalConstructor(int start, int end) {
    public RangeRecordeCanincalConstructor(int start, int end){ // canonical constructor
        if (end <= start){
            throw new IllegalArgumentException("the sart must be less that the end");
        }
        if (start<0){
            this.start = 0;
        } else {
            this.start = start;
        }
        if (end > 100) {
            this.end = 100;
        } else {
            this.end = end;
        }
    }
}
