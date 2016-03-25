package tbansal.probelms.tree.advance;

import org.junit.Test;

public class FenwickTreeTest {

	@Test
	public void testGetParent() {
		for (int i = 1; i < 15; i++) {
			System.out.println("Parent of " + i + "("
					+ Integer.toBinaryString(i) + ")" + "is "
					+ FenwickTree.getparent(i) + "("
					+ Integer.toBinaryString(FenwickTree.getparent(i)) + ")");
		}
	}
	
	@Test
	public void testGetChild() {
		for (int i = 1; i < 15; i++) {
			System.out.println("Parent of " + i + "("
					+ Integer.toBinaryString(i) + ")" + "is "
					+ FenwickTree.getNext(i) + "("
					+ Integer.toBinaryString(FenwickTree.getNext(i)) + ")");
		}
	}
	
	@Test
	public void test2sComplement() {
		for (int i = 1; i < 15; i++) {
			System.out.println("2s complement of " + i + "("
					+ Integer.toBinaryString(i) + ")" + "is "
					+ FenwickTree.get2scomplement(i) + "("
					+ Integer.toBinaryString(FenwickTree.get2scomplement(i)) + ")");
		}
	}

}
