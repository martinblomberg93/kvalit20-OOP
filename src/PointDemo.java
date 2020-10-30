public class PointDemo {
    public static void main(String[] args) {


        // skapa en punkt
        Point p1 = new Point();
        System.out.println("(" + p1.x +"," + p1.y + ")");

        // skapa en array som innehåller 5 referensvariabler
        Point[] arr = new Point[5];
        // vi har fått en arrray med 5 referensvariabler
        for(Point p : arr)
            System.out.println(p);

        // skapa 5 punkter
        for (int i = 0; i <arr.length; i++)
            arr[i] = new Point();

        // skriv ut referenserna
        for (Point p : arr)
            System.out.println(p);

        //skriv ut punkterna
        for(Point p : arr)

            System.out.println("(" + p1.x +"," + p1.y + ")");




    }
}
