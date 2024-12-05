package de.fayedev.ls4apiserver.web;

import de.fayedev.ls4apiserver.exception.ApplicationException;
import de.fayedev.ls4apiserver.model.bugreport.dto.BugReportIn;
import de.fayedev.ls4apiserver.model.bugreport.dto.BugReportOut;
import de.fayedev.ls4apiserver.service.BugReportService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/bugs")
public class BugReportRestController implements BaseRestController {

    private final BugReportService bugReportService;

    public BugReportRestController(BugReportService bugReportService) {
        this.bugReportService = bugReportService;
    }

    @PutMapping
    public BugReportOut createBugReport(@RequestBody @Valid BugReportIn body) throws ApplicationException {
        return bugReportService.createBugReport(getAuthenticatedUserName(), body.getDescription(), body.getText());
    }

    @GetMapping
    public List<BugReportOut> getBugReports() {
        return bugReportService.getBugReports();
    }
}
