package baseball.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {

    Balls computerBalls;

    @BeforeEach
    void setUp() {
        computerBalls = new Balls(4, 6, 8);
    }

    @Test
    void 결과_1스트라이크() {
        Ball myBall = new Ball(4, 1);
        PlayType playType = computerBalls.play(myBall);
        assertThat(playType).isEqualTo(PlayType.STRIKE);
    }

    @Test
    void 결과_1볼() {
        Ball myBall = new Ball(4, 2);
        PlayType playType = computerBalls.play(myBall);
        assertThat(playType).isEqualTo(PlayType.BALL);
    }

    @Test
    void 결과_낫싱() {
        Ball myBall = new Ball(5, 3);
        PlayType playType = computerBalls.play(myBall);
        assertThat(playType).isEqualTo(PlayType.NOTHING);
    }

    @Test
    void 결과_3스트라이크() {
        Balls myBall = new Balls(4, 6, 8);
        PlayTypes playTypes = myBall.play(computerBalls);
        List<PlayType> playTypeList = playTypes.getPlayType();
        assertThat(playTypeList).containsExactly(PlayType.STRIKE, PlayType.STRIKE, PlayType.STRIKE);
    }

    @Test
    void 결과_1볼_1스트라이크() {
        Balls myBall = new Balls(4, 3, 6);
        PlayTypes playTypes = myBall.play(computerBalls);
        List<PlayType> playTypeList = playTypes.getPlayType();
        assertThat(playTypeList).containsExactly(PlayType.STRIKE, PlayType.NOTHING, PlayType.BALL);
    }
}