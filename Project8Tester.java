import java.awt.Point;


public class Project8Tester {

	public static void main(String[] args) {
		MyArrayList<Point> list = new MyArrayList<Point>();
		for (int i = 0; i < 15; i++){
			int x = (int)((Math.random() * 100) % 100);
			int y = (int)((Math.random() * 100) % 100);
			list.add(new Point(x,y));
		}
		Point pt1 = list.get(0);
		System.out.println("This point: " + pt1.toString() + " should be the same as this one: ");
		pt1 = list.remove(0);
		System.out.println(pt1.toString());
		Point pt2 = list.get(0);
		System.out.println("This one should be different: " + pt2.toString());
		System.out.println("The current size is: " + list.size() + " - which should be 14.");
		list.add(new Point(5,5));
		System.out.println("The current size is: " + list.size() + " - which should be 15 and");
		System.out.println("the last point is " + list.get(list.size()-1) + " which should be [x=5,y=5].");
		list.clear();
		System.out.println("The current size is: " + list.size() + " - which should be 0.");
		list.add(new Point(5,5));
		System.out.println("The current size is: " + list.size() + " - which should be 1 and");
		System.out.println("the only point is " + list.get(list.size()-1) + " which should be [x=5,y=5].");
	}

}
