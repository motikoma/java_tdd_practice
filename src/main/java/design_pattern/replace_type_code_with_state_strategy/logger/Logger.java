package design_pattern.replace_type_code_with_state_strategy.logger;

public class Logger {
    private enum State {
        STOPPED {
            @Override
            public void start() {
                System.out.println("Logger is started");
            }

            @Override
            public void stop() {
                System.out.println("Logger is stopped");
            }

            @Override
            public void log(String message) {
                System.out.println(message);
            }
        },
        LOGGING {
            @Override
            public void start() {
                System.out.println("Logger is already started");
            }

            @Override
            public void stop() {
                System.out.println("Logger is stopped");
            }

            @Override
            public void log(String message) {
                System.out.println(message);
            }
        };

        public abstract void start();
        public abstract void stop();
        public abstract void log(String message);
    }

    private State state;

    public Logger() {
        setState(State.STOPPED);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void start() {
        state.start();
        setState(State.LOGGING);
    }

    public void stop() {
        state.stop();
        setState(State.STOPPED);
    }

    public void log(String msg) {
        state.log(msg);
    }
}
