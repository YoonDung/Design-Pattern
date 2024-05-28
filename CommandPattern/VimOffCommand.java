package CommandPattern;

public class VimOffCommand implements Command{
    Vim vim;
    public VimOffCommand(Vim vim) {
            this.vim = vim;
        }
        public void execute() {
            vim.off();
        }
        public void undo() {
            vim.on();
        }
}
