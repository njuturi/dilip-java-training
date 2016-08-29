package com.github.dilipptt.programs;
// Write a Counter that returns the next number. The counter has a specified range and it cycles. That is if the counter’s range is 10 to 20, and the current value of the counter is 20, when you get the next number, it will be 10.

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class CounterList {
	Node head;

	public CounterList() {
		head = null;
	}

	// Initializing the circular list
	void pushNode(Node node) {
		Node currentNode = head;
		// inserting first node
		if (currentNode == null) {
			node.next = node;
			head = node;
		} else {
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = node;
			node.next = head;
		}
	}

	// Finding the next node
	public int nextNumber(int num) {
		Node currentNode = head;
		while (currentNode.data != num) {
			currentNode = currentNode.next;
		}
		return currentNode.next.data;
	}

	public static void main(String[] args) {
		CounterList list = new CounterList();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the starting number: ");
		int start = scan.nextInt();
		System.out.print("Enter the ending number: ");
		int end = scan.nextInt();
		Node node = null;
		for (int i = start; i <= end; i++) {
			node = new Node(i);
			list.pushNode(node);
		}
		System.out.print("Enter the number to find its next number: ");
		int nextNum = list.nextNumber(scan.nextInt());
		System.out.print("The next number in the counter is: " + nextNum);
	}
}
