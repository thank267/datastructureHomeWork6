package lesson6;

import java.util.Random;

public class Test {

    private static final int LENGTH = 20;


    public static void main(String[] args) {

        final Random random = new Random();

        int balancedCount=0, unBalancedCount=0;


        Tree<Integer>[] trees = new Tree[LENGTH];

        for (int i = 0; i < trees.length; i++) {

            TreeImpl<Integer> tree = new TreeImpl<Integer>();

            for (int j = 0; j < 12; j++) {
                tree.add(random.nextInt(25 + 25) -25);
            }

            trees[i] = tree;

            final Node<Integer> root = tree.getRoot();

            final boolean isBalanced = tree.isBalanced(root);

            if (isBalanced) {
                balancedCount++;
            } else {
                unBalancedCount++;
            }

            tree.display();

            System.out.println("' ".repeat(20)+"Глубина: "+tree.height(root)+", Сбалансированность: "+isBalanced+" '".repeat(20) );
        }

        System.out.println("Процент несбалансированных: " + 1.0 * unBalancedCount / LENGTH);


    }
}
