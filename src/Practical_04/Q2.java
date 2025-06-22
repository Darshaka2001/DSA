package Practical_04;

public class Q2 {


    public static void main(String[] args) {
        String[] nameArray = {"Chamari Athapaththu","Anushka Sanjeewani",
                                "Kavisha Dilhari","Harshitha Samarawickrama",
                                "Sugandika Kumari","Hasini Perera"};

        int[] scoreArray = {63,24,17,12,10,3};
        int[] ballArray = {48,22,18,13,9,3};

        List nameList = new List(nameArray.length);
        List scoreList  = new List(scoreArray.length);
        List ballList = new List(ballArray.length);
        List strikeRateList = new List(scoreArray.length);

        for (int i = 0; i < nameArray.length; i++) {
            nameList.add(nameArray[i]);
            scoreList.add(scoreArray[i]);
            ballList.add(ballArray[i]);
        }

        int maxScore  = scoreList.get(0);
        for (int i = 0; i < scoreList.size(); i++) {
            if (scoreList.get(i) > maxScore){
                maxScore = scoreList.get(i);
            }
        }

        System.out.println("Highest Scoring Player is : "+nameList.getStr(scoreList.indexOf(maxScore)));

        int minBall = ballList.get(0);
        for (int i = 0; i < ballList.size(); i++) {
            if (ballList.get(i) < minBall)
                minBall = ballList.get(i);
        }

        System.out.println("Lowest Number of Ball face : "+nameList.getStr(ballList.indexOf(minBall)));
        System.out.println();

        for (int i = 0; i < nameList.size(); i++) {
            int score = scoreList.get(i);
            int ballCount = ballList.get(i);
            strikeRateList.add(displayBattingStrike(score, ballCount));
            System.out.println(nameList.getStr(i)+"\t:"+displayBattingStrike(score, ballCount));
        }

        int highestStrike = displayBattingStrike(scoreList.get(0),ballList.get(0));

        for (int i = 0; i < nameList.size(); i++) {
            if (displayBattingStrike(scoreList.get(i),ballList.get(i)) > highestStrike)
                highestStrike = displayBattingStrike(scoreList.get(i),ballList.get(i));
        }

        System.out.println();
        System.out.println("Player of the match : "+nameList.getStr(strikeRateList.indexOf(highestStrike)));

    }

    public static int displayBattingStrike(int score, int ballCount){
        return  (score * 100) / ballCount;

    }
}
