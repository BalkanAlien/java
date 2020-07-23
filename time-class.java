public class tuna {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s)
    {
        hour = (( h >= 0 && h  <24) ? h : 0); //if the condition doesn't match (if h isn't between 0 and 24) then set it by default to 0 so it doesn't mess up the program
        minute = ((m >= 0 && m < 60) ? m : 0);
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour,minute,second);
    }
}