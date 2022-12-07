;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname geometry) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; Grant Commodore

; This is a simplified version of the geometry program.

; Function that provides the area of a circle.
(define (circi_area radius)
  (* 3.14 (* radius radius)))

; Function that provides the circumference of a circle.
(define (circi_circum radius)
  (* 2 (* 3.14 radius)))

; Function that provides the area of a rectangle.
(define (rect_area length width)
  (* length width))

; Function that provides the perimeter of a rectangle.
(define (rect_perim length width)
  (+ (* 2 length) (* 2 width)))

; Function that provides the area of a triangle.
(define (tri_area base height hypotenuse)
  (* 0.5 (* base height)))

; Function that provides the perimeter of a triangle.
(define (tri_perim base height hypotenuse)
  (+ base height hypotenuse))

; Function that provides the area of a hexagon.
(define (hex_area side)
  (* (* side side) (* 0.5(* 3 (sqrt 3)))))

; Function that provides the perimeter of a hexagon.
(define (hex_perim side)
  (* 6 side))

; Computations for the circle.
(print "The area of the circle is: ")
(print(circi_area 5))
(newline)
(print "The circumference of the circle is: ")
(print(circi_circum 5))
(newline)
(newline)

; Computations for the rectangle.
(print "The area of the rectangle is: ")
(print(rect_area 4 5))
(newline)
(print "The perimeter of the rectangle is: ")
(print(rect_perim 4 5))
(newline)
(newline)

; Computations for the triangle.
(print "The area of the triangle is: ")
(print(tri_area 4 5 6))
(newline)
(print "The perimeter of the triangle is: ")
(print(tri_perim 4 5 6))
(newline)
(newline)

; Computations for the hexagon.
(print "The area of the hexagon is: ")
(print(hex_area 5))
(newline)
(print "The perimeter of the hexagon is: ")
(print(hex_perim 5))
(newline)
(newline)