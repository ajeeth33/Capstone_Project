# Capstone Project Phase 1: Requirements & Design

## Selected Track
Option B: The Smart Scheduler

## Real-World Context
This project models a priority-based scheduling system, such as an emergency room triage system, operating system job scheduler, or loan processing system.

## Problem Description
The system must manage incoming tasks with different priority levels. Higher-priority tasks should be processed before lower-priority tasks, even if the lower-priority tasks arrived first.

## Data Structure Choice
I will use a Max-Heap because the highest-priority task can always stay at the root of the heap. This makes it efficient to find and remove the most important task.

## UML Diagram

Task
- id: int
- name: String
- priority: int

SmartScheduler
- heap: ArrayList<Task>

+ insert(Task task): void
+ peek(): Task
+ removeHighestPriority(): Task
+ isEmpty(): boolean

## Big-O Expectations
Inserting a task takes O(log n) because the task may need to bubble up the heap. Removing the highest-priority task takes O(log n) because the heap must rebalance after removal. 
Peeking at the highest-priority task takes O(1) because it is stored at the root.
