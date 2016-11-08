<!DOCTYPE html>
<html>
<head>
<title>ToDo API Client Demo</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css"
	rel="stylesheet">
<script src="http://ajax.aspnetcdn.com/ajax/jquery/jquery-1.9.0.js"></script>
<script
	src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/knockout/knockout-2.2.1.js"></script>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<a class="brand" href="#">ToDo API Client Demo</a>
		</div>
	</div>
	<div id="main" class="container">Main content here!</div>
	<script type="text/javascript">
		// application code here!
	</script>
	<table class="table table-striped">
		<tr>
			<td style="width: 1px;"></td>
			<td><b>Task</b></td>
			<td><b>Options</b></td>
		</tr>
		<!-- ko foreach: tasks -->
		<tr>
			<td><span data-bind="visible: done" class="label label-success">Done</span>
				<span data-bind="visible: !done()" class="label label-important">In
					Progress</span></td>
			<td><p>
					<b data-bind="text: title"></b>
				</p>
				<p data-bind="text: description"></p></td>
			<td>
				<button data-bind="click: $parent.beginEdit" class="btn">Edit</button>
				<button data-bind="click: $parent.remove" class="btn">Delete</button>
				<span data-bind="visible: done">
					<button data-bind="click: $parent.markInProgress" class="btn">Mark
						In Progress</button>
			</span> <span data-bind="visible: !done()">
					<button data-bind="click: $parent.markDone" class="btn">Mark
						Done</button>
			</span>
			</td>
		</tr>
		<!-- /ko -->
	</table>
	<button data-bind="click: beginAdd" class="btn">Add Task</button>

	<button class="btn">Add Task</button>
</body>
</html>