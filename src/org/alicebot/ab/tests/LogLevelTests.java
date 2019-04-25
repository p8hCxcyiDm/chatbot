package org.alicebot.ab.tests;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.MagicStrings;
import org.junit.Test;

import junit.framework.TestCase;

public class LogLevelTests extends TestCase {

  @Test
  public void testLogLevel() {
    Bot bot = new Bot("alice2", MagicStrings.root_path, "test");
    Chat chat = new Chat(bot);
    check(chat, "Hi, I'm John from Unicredit and have a problem with in Calculo", "");
  }

  private void check(Chat chatSession, String request, String expected) {
    String actual = chatSession.multisentenceRespond(request);
    assertEquals(actual, expected);
  }

}
