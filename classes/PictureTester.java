/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.zeroBlue();
    beach.explore(); // comment these out in repl.it

    // uncomment this in repl.it to test your code!!
    // beach.write("imagesOutput/beach.jpg");
  }

  public static void testKeepOnlyBlue() {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.keepOnlyBlue();
    beach.explore(); // comment these out in repl.it
  }

  public static void testNegate(){
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale(){
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.grayscale();
    beach.explore();
  }

  public static void testFixUnderwater() {
    Picture beach = new Picture("images/beach.jpg");
    beach.explore(); // comment these out in repl.it
    beach.fixUnderwater();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  public static void testMirrorVerticalRightToLeft () {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal () {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalBotToTop () {
    Picture caterpillar = new Picture("images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  public static void testMirrorArms(){
    Picture temple = new Picture("images/snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }

  public static void testMirrorGull(){
    Picture temple = new Picture("images/seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }

  public static void testMirrorDiagonal(){
    Picture temple = new Picture("images/seagull.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  public static void testMyCollage()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }

  public static void testCopy()
  {
    Picture canvas = new Picture("images/640x480.jpg");
    canvas.copy(canvas,50,0);
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("images/swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   /* testZeroBlue();
    testKeepOnlyBlue();
    testNegate();*/
    testGrayscale();/*
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testMirrorDiagonal();
    testCollage();
    testMyCollage();
    testCopy();
    testEdgeDetection();
    testEdgeDetection2();
    testChromakey();
    testEncodeAndDecode();
    testGetCountRedOverValue(250);
    testSetRedToHalfValueInTopHalf();
    testClearBlueOverValue(200);
    testGetAverageForColumn(0);*/
  }
}