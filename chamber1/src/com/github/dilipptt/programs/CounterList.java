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

	CounterList(int start, int end, int num) {
		if (num < start || num > end || end < start) {
			throw new IllegalArgumentException();
		}
	}

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

	public void createList(int start, int end) {
		Node node = null;
		for (int i = start; i <= end; i++) {
			node = new Node(i);
			pushNode(node);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the starting number: ");
		int start = scan.nextInt();
		System.out.print("Enter the ending number: ");
		int end = scan.nextInt();
		System.out.print("Enter the number to find its next number: ");
		int nextNum = scan.nextInt();
		CounterList list = new CounterList(start, end, nextNum);
		Node node = null;
		for (int i = start; i <= end; i++) {
			node = new Node(i);
			list.pushNode(node);
		}
		System.out.print("The next number in the counter is: "
				+ list.nextNumber(nextNum));
	}
}
