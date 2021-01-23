package cmsc256;

/** 
  Determines if three doubles can be sides of triangle. 
*/
public class Triangle  {

   /** Length of side 1. */
   private double sideA;

   /** Length of side 2. */
   private double sideB;

   /** Length of side 3. */
   private double sideC;

   /**
    * Creates a Triangle.
    *
    * @param aIn length of side 1.
    * @param bIn length of side 2.
    * @param cIn length of side 3.
    */
   public Triangle(double aIn, double bIn, double cIn) {
      sideA = aIn;
      sideB = bIn;
      sideC = cIn;

      if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
         throw new IllegalArgumentException("Sides: " + sideA + " " + sideB + " " + sideC
            + " -- <replace this string>");       // add an explanation why this exception is being thrown.
      }
      if ((sideA >= sideB + sideC) || (sideB >= sideA + sideC) || (sideC >= sideA + sideB)) {
         throw new IllegalArgumentException("Sides: "
            + sideA + " " + sideB + " " + sideC
            + " -- <replace this string>");      // add an explanation why this exception is being thrown.
      }
   }

   /**
    *  Classifies a triangle based on the lengths of the three sides.
    *  The classifications are either: "equilateral", "scalene", "isosceles", 
    *  or "not a triangle". The returned string must match one of these.Tri
    * 
    * @return the triangle classification.
    */
   public String classify() {
      String result = "";
      //TODO:  implement this method according to the specification in the comment block
      return result;
   }

}
