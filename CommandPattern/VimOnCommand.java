package CommandPattern;

public class VimOnCommand implements Command {
    Vim vim;

    public VimOnCommand(Vim vim) {
        this.vim = vim;
    }

    public void execute() {
        vim.on();
    }

    public void undo() {
        vim.off();
    }
}
