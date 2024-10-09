<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Product Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
      @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap');

      body {
        background: linear-gradient(135deg, rgba(58,123,213,1) 0%, rgba(58,213,175,1) 100%);
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        font-family: 'Poppins', sans-serif;
      }
      .glass-card {
        background: rgba(255, 255, 255, 0.2);
        backdrop-filter: blur(10px);
        -webkit-backdrop-filter: blur(10px);
        border-radius: 20px;
        padding: 40px;
        box-shadow: 0 8px 32px 0 rgba(31, 38, 135, 0.37);
        max-width: 600px;
        width: 100%;
        border: 1px solid rgba(255, 255, 255, 0.18);
      }
      h2 {
        color: #fff;
        font-weight: 600;
        text-align: center;
        margin-bottom: 20px;
      }
      .form-label {
        font-weight: 500;
        color: #fff;
      }
      .form-control {
        border-radius: 10px;
        border: none;
        box-shadow: none;
        padding: 10px;
        background: rgba(255, 255, 255, 0.6);
        color: #000;
      }
      .form-control:focus {
        box-shadow: 0 0 8px rgba(0, 255, 234, 0.8);
      }
      .btn {
        border-radius: 50px;
        padding: 10px 20px;
        transition: all 0.4s ease;
        font-weight: 600;
      }
      .btn-primary {
        background-color: #4A90E2;
        border: none;
      }
      .btn-warning {
        background-color: #f39c12;
        border: none;
      }
      .btn-danger {
        background-color: #e74c3c;
        border: none;
      }
      .btn-info {
        background-color: #1abc9c;
        border: none;
      }
      .btn:hover {
        transform: translateY(-3px);
        box-shadow: 0 6px 15px rgba(0, 0, 0, 0.3);
      }
      .btn-primary:hover {
        background-color: #3d77c3;
      }
      .btn-warning:hover {
        background-color: #d68d10;
      }
      .btn-danger:hover {
        background-color: #d62e20;
      }
      .btn-info:hover {
        background-color: #17a889;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <div class="glass-card">
        <form method="post" action="Controller" class="p-4">
          <h2>Product Form</h2>

          <div class="mb-3 row">
            <label for="pid" class="col-sm-4 col-form-label">Product ID</label>
            <div class="col-sm-8">
              <input type="text" class="form-control" id="pid" name="pid" placeholder="Enter Product ID">
            </div>
          </div>

          <div class="mb-3 row">
            <label for="pname" class="col-sm-4 col-form-label">Product Name</label>
            <div class="col-sm-8">
              <input type="text" class="form-control" id="pname" name="pname" placeholder="Enter Product Name">
            </div>
          </div>

          <div class="text-center">
            <button type="submit" class="btn btn-primary me-2" name="insert" value="insert">Insert</button>
            <button type="submit" class="btn btn-warning me-2" name="update" value="update">Update</button>
            <button type="submit" class="btn btn-danger me-2" name="delete" value="delete">Delete</button>
            <button type="submit" class="btn btn-info" name="show" value="show">Show</button>
          </div>
        </form>
      </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  </body>
</html>
