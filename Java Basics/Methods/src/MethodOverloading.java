public class MethodOverloading {

    public static void main(String[] args) {

        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(6.26, 2.2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0){
            return -1;
        }

        double wallArea = width * height;
        double extraCovers = 0;
        double remainingArea = 0;
        int bucketsNeeded = 0;

        if(extraBucket > 0){

            extraCovers = extraBucket * areaPerBucket;
            remainingArea = wallArea - extraCovers;
            bucketsNeeded = (int) Math.ceil(remainingArea / areaPerBucket);


        } else {

            bucketsNeeded = (int) Math.ceil(wallArea /  areaPerBucket);
        }

        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double wallArea = width * height;
        int bucketsNeeded = (int) Math.ceil(wallArea / areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int bucketsNeeded = (int) Math.ceil(area / areaPerBucket);

        return bucketsNeeded;
    }
}
