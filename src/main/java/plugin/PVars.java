package main.java.plugin;

import arc.struct.Seq;
import mindustry.gen.*;
import arc.util.Timer;
import static main.java.plugin.func.*;

public class PVars {
    public static Seq<Player> awaitingClick = new Seq<>();
    public static Seq<TeamDat> playerTeams = new Seq<>();
    // public static Seq<leftPlayerData> leftDatas = new Seq<>();
    public static Seq<joinRequest> joinRequests = new Seq<>();
    public static boolean gameStarted;
    public static Timer.Task GameOverWhen = null;
    public static long GameStartWhen = 0L;
}
