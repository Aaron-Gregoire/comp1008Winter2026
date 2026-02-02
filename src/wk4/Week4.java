package wk4;

public class Week4 {
   public static void main(String[] args) {
       BarrieGoTrain train = new BarrieGoTrain();
      // train.station = "Ben Station";
      //enum belongs to the class ex: BarrieGoTrain.Station
      train.chosenStation = BarrieGoTrain.Station.UNION;

        Student s = new Student();

        //Student m = s.MatureStudent("hi", 30);

       Student m = Student.MatureStudent( "hi", 30);
       Student m1 = new Student("dec 1");
       Student m2 = new Student("joe", "oct 1", 20, 3.5);

    }
}
