using System;
using System.Collections.Generic;
using System.Linq;
using Avalonia.Controls;
using Avalonia.Input;
using Avalonia.Threading;

namespace FirstApp;

public partial class MainWindow : Window {
    DispatcherTimer timer = new DispatcherTimer();
    int tenthsOfSecondsElapsed;
    int matchesFound;

    public MainWindow() {
        InitializeComponent();

        timer.Interval = TimeSpan.FromSeconds(.1);
        timer.Tick += Timer_Tick;
        SetUpGame();
    }

    private void Timer_Tick(object sender, EventArgs e) {
        tenthsOfSecondsElapsed++;
        TimeTextBlock.Text = (tenthsOfSecondsElapsed / 10F).ToString("0.0s");
        if (matchesFound == 8) {
            timer.Stop();
            TimeTextBlock.Text = TimeTextBlock.Text + " - Play again?";
        }
    }

    private void SetUpGame() {
        List<string> animalEmoji = new List<string>() {
            "🐙", "🐙",
            "🐠", "🐠",
            "🐘", "🐘",
            "🐳", "🐳",
            "🐪", "🐪",
            "🦕", "🦕",
            "🦘", "🦘",
            "🦔", "🦔"
        };

        Random random = new Random();
        foreach (TextBlock textBlock in MainGrid.Children.OfType<TextBlock>()) {
            if (textBlock.Name != "TimeTextBlock") {
                textBlock.IsVisible = true;
                int index = random.Next(animalEmoji.Count);
                string nextEmoji = animalEmoji[index];
                textBlock.Text = nextEmoji;
                animalEmoji.RemoveAt(index);
            }
        }

        timer.Start();
        tenthsOfSecondsElapsed = 0;
        matchesFound = 0;
    }

    TextBlock lastTextBlockClicked;
    bool findingMatch = false;

    private void TextBlock_PointerPressed(object sender, PointerPressedEventArgs e) {
        TextBlock textBlock = sender as TextBlock;
        if (findingMatch == false) {
            textBlock.IsVisible = false;
            lastTextBlockClicked = textBlock;
            findingMatch = true;
        }
        else if (textBlock.Text == lastTextBlockClicked.Text) {
            matchesFound++;
            textBlock.IsVisible = false;
            findingMatch = false;
        }
        else {
            lastTextBlockClicked.IsVisible = true;
            findingMatch = false;
        }
    }

    private void TimeTextBlock_PointerPressed(object sender, PointerPressedEventArgs e) {
        if (matchesFound == 8) {
            SetUpGame();
        }
    }
}