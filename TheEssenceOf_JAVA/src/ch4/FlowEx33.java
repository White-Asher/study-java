package ch4;

public class FlowEx33 {
    public static void main(String[] args) {
        //for문에 Loop1이라는 이름을 붙였다.
        Loop1 : for (int i=2; i<=9; i++){
            for(int j = 1; j <=9; j++){
                if(j==5)
//                    break Loop1;
//                    break;
//                    continue Loop1;
                    continue;
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
/*
break Loop1;
2*1=2
2*2=4
2*3=6
2*4=8

break;
2*1=2
2*2=4
2*3=6
2*4=8

3*1=3
3*2=6
3*3=9
3*4=12

4*1=4
4*2=8
4*3=12
4*4=16

5*1=5
5*2=10
5*3=15
5*4=20

6*1=6
6*2=12
6*3=18
6*4=24

7*1=7
7*2=14
7*3=21
7*4=28

8*1=8
8*2=16
8*3=24
8*4=32

9*1=9
9*2=18
9*3=27
9*4=36

continue Loop1;
2*1=2
2*2=4
2*3=6
2*4=8
3*1=3
3*2=6
3*3=9
3*4=12
4*1=4
4*2=8
4*3=12
4*4=16
5*1=5
5*2=10
5*3=15
5*4=20
6*1=6
6*2=12
6*3=18
6*4=24
7*1=7
7*2=14
7*3=21
7*4=28
8*1=8
8*2=16
8*3=24
8*4=32
9*1=9
9*2=18
9*3=27
9*4=36

continue;
2*1=2
2*2=4
2*3=6
2*4=8
2*6=12
2*7=14
2*8=16
2*9=18

3*1=3
3*2=6
3*3=9
3*4=12
3*6=18
3*7=21
3*8=24
3*9=27

4*1=4
4*2=8
4*3=12
4*4=16
4*6=24
4*7=28
4*8=32
4*9=36

5*1=5
5*2=10
5*3=15
5*4=20
5*6=30
5*7=35
5*8=40
5*9=45

6*1=6
6*2=12
6*3=18
6*4=24
6*6=36
6*7=42
6*8=48
6*9=54

7*1=7
7*2=14
7*3=21
7*4=28
7*6=42
7*7=49
7*8=56
7*9=63

8*1=8
8*2=16
8*3=24
8*4=32
8*6=48
8*7=56
8*8=64
8*9=72

9*1=9
9*2=18
9*3=27
9*4=36
9*6=54
9*7=63
9*8=72
9*9=81
 */