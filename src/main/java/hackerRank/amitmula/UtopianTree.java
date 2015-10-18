
/**
 * Created by amitmula on 9/14/2014.
 *
 * The Utopian Tree goes through 2 cycles of growth every year.
 * The first growth cycle occurs during the spring, when it doubles in height.
 * The second growth cycle occurs during the summer, when its height increases by 1 meter.
 *
 * Now, a new Utopian Tree sapling is planted at the onset of spring. Its height is 1 meter.
 * Can you find the height of the tree after N growth cycles?
 *
 * https://www.hackerrank.com/challenges/utopian-tree
 */

package hackerRank.amitmula;

import java.util.Scanner;

public class UtopianTree {

	int height;
	static boolean toggle;

	public UtopianTree() {
		height =  1;
		toggle = true;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void monsoon() {
		height *=2;
	}

	public void summer() {
		height +=1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cycles = scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<cycles; i++) {
			UtopianTree tree = new UtopianTree();
			int n = scanner.nextInt();
			while (n > 0) {
				if(toggle)
					tree.monsoon();
				else
					tree.summer();
				n--;
				toggle = !toggle;
			}
			System.out.println(tree.getHeight());
		}
		scanner.close();
	}
}
