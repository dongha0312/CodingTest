//import java.io.*;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//import static javax.swing.text.html.HTML.Attribute.N;
//
//public class Main {
//    static void solve(int a){
//        int [] card = new int[a*2];
//        int [] result = new int[a];
//        for (int i = 0; i < a; i++) {
//            card[i] = i+1;
//        }
//        int idx1, idx2, idx3;
//        idx1 = idx3 = 0;
//        idx2 = a;
//
//        while(idx3 < a){
//            result[idx3++] = card[idx1++];
//            if(idx1 == idx2)break;
//            card[idx2++] = card[idx1++];
//        }
//        for (int i = 0; i<a; i++){
//            System.out.print(result[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        solve(n);
//    }
//}
//
//
//typedef int integer;
//typedef struct _QUEUE{
//    int value;
//    struct _QUEUE *next;
//}QUEUE;
//
//QUEUE *head, *tail;
//
//void enQueue(int x){
//    if(head == NULL){
//        head = tail = new QUEUE;
//        head -> value = x;
//        head -> next = NULL;
//        return;
//    }
//    QUEUE *temp;
//    temp = new QUEUE;
//    temp -> value = x;
//    temp -> next = NULL;
//    tail -> next = temp;
//    tail = temp;
//}
//
//int deQueue(){
//    if(head == NULL) return NULL;
//
//    int value = head -> value;
//
//    QUEUE *temp = head;
//    head = head-> next;
//    if(head == NULL) tail = NULL;
//    delete temp;
//
//    return value;
//}
//2161 baek
//void solve(){
//    head = tail = NULL;
//    for (int i = 1; i<= N; i++)enQueue(i);
//
//    int rIdx = 0;
//    while(1){
//        int value = deQueue();
//        if(value == NUll) break;
//        result[rIdx++] = value;
//        enQueue(deQueue());
//    }
//}
//
//2161 baek number in order
//void solve(){
//    head = tail = NULL;
//    for(i = a-1; i >= 0; i--){
//        enQueue(card[i]);
//
//        enQueue(deQueue());
//    }
//    enQueue(card[0]);
//
//    for(int i = N-1; i>=0; i--){
//        result[i] = deQueue();
//    }
//
//}
//
//out:
//    while(1){
//    for(int i = 0; i < N; i++)fprinf(out,"%d", value);
//
//    }
