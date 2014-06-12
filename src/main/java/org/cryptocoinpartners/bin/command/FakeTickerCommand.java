package org.cryptocoinpartners.bin.command;

import com.beust.jcommander.Parameters;
import org.cryptocoinpartners.module.Esper;


/**
 * @author Tim Olson
 */
@SuppressWarnings("UnusedDeclaration")
@Parameters(commandNames = "mockticker", commandDescription = "Launch a test ticker and save bogus data to the database")
public class FakeTickerCommand extends Command {
    public void run() {
        Esper esper = new Esper();
        esper.loadModule("mockticker");
        esper.loadModule("savedata");
    }

}
