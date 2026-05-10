import logging

# * With "basicConfig", we can specify what details to include in the log messages
logging.basicConfig(
    # ~ The "level" parameter sets the minimum severity level of messages to be logged.
    level=logging.DEBUG,
    # ~ "format", "filename"
    format="%(asctime)s - %(levelname)s - %(message)s",
    # filename="app.log",
)

# * "disable" hides all messages with a severity level less than or equal to the specified level
# logging.disable(logging.CRITICAL)

# * "debug", "info", "warning", "error", and "critical" are the different severity levels of log messages.
logging.debug("Something happened.")
