# MVP - Model View Presenter
----------------------------

# M(Model)
> Class này dùng để xử lý dữ liệu.

> Tạo dữ liệu or Lấy dữ liêu từ database hoặc network...

> Dữ liệu được đưa vào Model rồi đẩy sang Presenter thông qua các hàm callback.

# V(View)
> Class này nhận dữ liệu từ Presenter và đưa dữ liệu hiển thị lên View.

# P(Presenter)
> Class xử lý bussiness logic
> Lớp trung gian giao tiếp giữa M-V 

```
M-V không giao tiếp trực tiếp với nhau được.
Class View sẽ nhận được event từ user, sau đó chuyển qua presenter. Presenter sẽ lấy dữ liệu từ Model và đẩy lên View.
```