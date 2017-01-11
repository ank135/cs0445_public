import static org.junit.Assert.*;
import org.junit.Test;

public class StringArrayListTest {

  @Test
  public void testAdd() {
    StringArrayList list = new StringArrayList();
    String s = "Test 1";
    list.add(s);
    assertEquals(list.size(), 1);
    assertEquals(list.get(0), s);
  }

  @Test
  public void testGet() {
    StringArrayList list = new StringArrayList();
    String s = "Test 1";
    list.add(s);
    assertEquals(list.get(0), s);
  }

  @Test
  public void testContains() {
    StringArrayList list = new StringArrayList();
    String s = "Test 1";
    list.add(s);
    assertTrue(list.contains(s));
  }

  @Test
  public void testIndexOf() {
    StringArrayList list = new StringArrayList();
    String s = "Test 1";
    list.add(s);
    assertEquals(list.indexOf(s), 1);
  }

  @Test
  public void testSize() {
    StringArrayList list = new StringArrayList();
    String s = "Test 1";
    list.add(s);
    assertEquals(list.size(), 1);
  }

  @Test
  public void testInsert() {
  }

  @Test
  public void testClear() {
    StringArrayList list = new StringArrayList();
    list.add("x");
    list.clear();
    assertTrue(list.isEmpty());
  }

  @Test
  public void testIsEmpty() {
    StringArrayList list = new StringArrayList();
    list.add("x");
    list.clear();
    assertTrue(list.isEmpty());
  }

  @Test
  public void testRemove() {
  }

  @Test
  public void testSet() {
  }

  @Test
  public void testToArray() {
  }
}
