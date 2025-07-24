import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GameLauncher extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 버튼 생성
        Button startButton = new Button("게임 시작");
        Button exitButton = new Button("종료");

        // 종료 버튼에 동작 부여
        exitButton.setOnAction(e -> {
            System.out.println("게임을 종료합니다.");
            System.exit(0);
        });

        // VBox 레이아웃 (수직 정렬)
        VBox root = new VBox(20); // 간격 20px
        root.setStyle("-fx-padding: 40; -fx-alignment: center;");
        root.getChildren().addAll(startButton, exitButton);

        // 씬 설정
        Scene scene = new Scene(root, 400, 300);

        // 스테이지(창) 설정
        primaryStage.setTitle("게임 시작 화면");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
